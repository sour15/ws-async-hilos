package pe.edu.cibertec.sw_async_hilos.remote.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class AsyncTaskService {

    @Async
    public CompletableFuture<String> operacionPagoOnline(){
        try {
            log.info("iniciando proceso de pago.");
            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Pago Exitoso");
    }
    @Async
    public CompletableFuture<String> operacionRegistrodeVentas(){
        try {
            log.info("iniciando registro de ventas.");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Registro de venta Exitoso");
    }

    @Async
    public CompletableFuture<String> operacionActualizacionCompras(){
        try {
            log.info("Actualización de compras.");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Actualización de compra Exitosa");
    }

}
