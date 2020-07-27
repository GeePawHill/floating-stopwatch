package org.geepawhill.fs

import tornadofx.*

class Main : App(MainView::class) {
}

class MainView : View() {
    override val root = borderpane {
        top = toolbar {
            button("Button")
        }
    }
}
	
