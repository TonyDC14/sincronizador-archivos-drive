package com.sincronizador.drive1.SNAPSHOT.Clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "clienteGoogleDrive", url = "https://www.googleapis.com/drive/v3")
public interface GoogleDrive {
    @GetMapping("/files")
    String getFiles();
}
