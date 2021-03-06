package samples.input

import antd.button.button
import antd.input.textArea
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.div

private val textareaDefaultValue = "autosize 属性适用于 textarea 节点，并且只有高度会自动变化。另外 autosize 可以设定为一个对象，指定最小行数和最大行数。autosize 属性适用于 textarea 节点，并且只有高度会自动变化。另外 autosize 可以设定为一个对象，指定最小行数和最大行数。autosize 属性适用于 textarea 节点，并且只有高度会自动变化。另外 autosize 可以设定为一个对象，指定最小行数和最大行数。autosize 属性适用于 textarea 节点，并且只有高度会自动变化。另外 autosize 可以设定为一个对象，指定最小行数和最大行数。autosize 属性适用于 textarea 节点，并且只有高度会自动变化。另外 autosize 可以设定为一个对象，指定最小行数和最大行数。autosize 属性适用于 textarea 节点，并且只有高度会自动变化。另外 autosize 可以设定为一个对象，指定最小行数和最大行数。autosize 属性适用于 textarea 节点，并且只有高度会自动变化。另外 autosize 可以设定为一个对象，指定最小行数和最大行数。ending"

interface TextareaResizeDemoState : RState {
    var autoResize: Boolean
}

class TextareaResizeDemo : RComponent<RProps, TextareaResizeDemoState>() {
    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    onClick = {
                        setState {
                            autoResize = !state.autoResize
                        }
                    }
                    style = js { marginButtom = 16 }
                }
                +"Auto Resize: ${state.autoResize}"
            }
            textArea {
                attrs {
                    rows = 4
                    autosize = state.autoResize
                    defaultValue = textareaDefaultValue
                }
            }
        }
    }
}

fun RBuilder.textareaResizeDemo() = child(TextareaResizeDemo::class) {}

fun RBuilder.textareaResize() {
    div("input-container") {
        attrs.id = "input-textarea-resize"
        textareaResizeDemo()
    }
}
