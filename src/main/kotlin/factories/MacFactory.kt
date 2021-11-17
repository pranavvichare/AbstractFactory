package factories

import buttons.Button
import buttons.MacButton
import checkboxes.Checkbox
import checkboxes.MacCheckBox

class MacFactory : GUIFactory {

    override fun createButton(): Button {
        return MacButton()
    }

    override fun createChechBox(): Checkbox {
        return MacCheckBox()
    }
}