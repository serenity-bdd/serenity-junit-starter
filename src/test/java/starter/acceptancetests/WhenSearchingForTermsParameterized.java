package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import starter.actions.navigation.NavigateTo;
import starter.actions.search.LookForInformation;

import java.util.stream.Stream;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTermsParameterized {

    @CastMember
    Actor actor;

    @ParameterizedTest(name = "{index} Should be able to search for {1} things")
    @MethodSource
    public void searchFor(String thing) {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.about(thing),
                Ensure.that(TheWebPage.title()).containsIgnoringCase(thing)
        );
    }


    private static Stream<Arguments> searchFor() {
        return Stream.of(Arguments.of("green"), Arguments.of("red"));
    }
}
