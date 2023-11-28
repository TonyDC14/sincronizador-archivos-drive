package com.sincronizador.drive1.SNAPSHOT.Configuradores;

import com.sincronizador.drive1.SNAPSHOT.Enumerados.Nube;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntornoEjecucion {
    @Value("${entorno.nube-objetivo}")
    private Nube nubeObjetivo;

    @Value("${entorno.ruta-archivo-credenciales}")
    private String rutaArchivoCredenciales;
}
