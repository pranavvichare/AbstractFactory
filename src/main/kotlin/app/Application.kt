package app

import checkboxes.Checkbox
import factories.GUIFactory


class Application {

    private lateinit var button : buttons.Button
    private lateinit var checkbox: Checkbox

    constructor(factory : GUIFactory){
        button = factory.createButton()
        checkbox = factory.createChechBox()
    }

    fun paint(){
        button.paint()
        checkbox.paint()
    }
}