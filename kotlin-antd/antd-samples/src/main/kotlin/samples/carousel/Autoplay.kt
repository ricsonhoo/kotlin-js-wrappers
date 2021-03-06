package samples.carousel

import antd.carousel.carousel
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.h3

fun RBuilder.autoplay() {
    div("carousel-container") {
        attrs.id = "carousel-autoplay"
        carousel {
            attrs.autoplay = true
            div {
                h3 { +"1" }
            }
            div {
                h3 { +"2" }
            }
            div {
                h3 { +"3" }
            }
            div {
                h3 { +"4" }
            }
        }
    }
}
