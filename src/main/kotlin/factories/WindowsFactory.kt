package factories

import buttons.Button
import buttons.WindowsButton
import checkboxes.Checkbox
import checkboxes.WindowsCheckBox

class WindowsFactory : GUIFactory {

    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createChechBox(): Checkbox {
        return WindowsCheckBox()
    }
}