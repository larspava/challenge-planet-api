package online.larspava.routes

import io.ktor.server.routing.*

fun Route.createPlanet(){
    post("/planet") { // Criar planeta

    }

    get("/planets") { // Listar Planetas

    }

    get("/planet/name/{name}") { // Receber planeta por nome (único)

    }

    get("/planet/{id}") { // Receber planeta por ID

    }

    delete("/planet/{id}") { // Deletar planeta por ID

    }
}