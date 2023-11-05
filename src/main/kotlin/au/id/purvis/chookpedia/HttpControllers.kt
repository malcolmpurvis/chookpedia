package au.id.purvis.chookpedia

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/")
class HTMLController() {
    @GetMapping("/")
    fun findAll() = "Hello World"
}
