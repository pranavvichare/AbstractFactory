package factories

import checkboxes.Checkbox
import buttons.Button

interface GUIFactory {

    fun createButton() : Button
    fun createChechBox() : Checkbox
}