package samples.rate

import antd.rate.rate
import kotlinx.html.id
import react.*
import react.dom.*

interface RaterState : RState {
    var value: Number?
}

class Rater : RComponent<RProps, RaterState>() {
    private val handleChange = fun (newValue: Number) {
        setState {
            value = newValue
        }
    }

    override fun RaterState.init() {
        value = 3
    }

    override fun RBuilder.render() {
        span {
            rate {
                attrs {
                    onChange = handleChange
                    value = state.value
                }
            }
            if (state.value != null) {
                span("ant-rate-text") {
                    +"${state.value} stars"
                }
            }
        }
    }
}

fun RBuilder.rater() = child(Rater::class) {}

fun RBuilder.text() {
    div("rate-container") {
        attrs.id = "rate-text"
        rater()
    }
}
