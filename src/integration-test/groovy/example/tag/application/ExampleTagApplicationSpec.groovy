package example.tag.application

import grails.gorm.transactions.Rollback
import grails.plugin.geb.ContainerGebSpec
import grails.testing.mixin.integration.Integration


/**
 * See https://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class ExampleTagApplicationSpec extends ContainerGebSpec {

    void "test something"() {
        when:"The home page is visited"
            go '/'

        then:"The title is correct"
            title == "Welcome to Grails"
    }

}
