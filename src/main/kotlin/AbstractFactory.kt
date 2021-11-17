import app.Application
import factories.GUIFactory
import factories.MacFactory
import factories.WindowsFactory

fun main(){

    fun configureApplication() : Application {
        var app : Application
        var factory : GUIFactory
        var osName : String = System.getProperty("os.name").toLowerCase()
        if(osName.contains("mac")){
            factory = MacFactory()
            app = Application(factory)
        }else{
            factory = WindowsFactory()
            app = Application(factory)
        }
        return app
    }

    var app : Application = configureApplication()
    app.paint()
}
