package antd.form

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.form(handler: RHandler<FormProps>) = child(FormComponent::class, handler)
fun RBuilder.formItem(handler: RHandler<FormItemProps>) = child(FormComponent.Item, jsObject {}, handler)
