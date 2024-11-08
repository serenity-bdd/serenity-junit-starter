package starter.acceptancetests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import starter.actions.navigation.NavigateTo;
import starter.actions.search.LookForInformation;

@RunWith(SerenityRunner.class)
class WhenSearchingForTermsWithJunit4 {

    @CastMember
    Actor actor;

    @Test
    void searchForRedThings() {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.about("red"),
                Ensure.that(TheWebPage.title()).containsIgnoringCase("red")
        );
    }

    @Test
    void searchForGreenThings() {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.about("green"),
                Ensure.that(TheWebPage.title()).containsIgnoringCase("green")
        );
    }
}
