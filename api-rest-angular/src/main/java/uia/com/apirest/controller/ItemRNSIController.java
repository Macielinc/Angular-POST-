package uia.com.apirest.controller;

import org.springframework.web.bind.annotation.*;
import uia.com.apirest.compras.InfoComprasUIA;
import uia.com.apirest.modelo.ItemReporteModelo;
import uia.com.apirest.servicio.ItemRNSIServicio;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ItemRNSIController
{
    private ItemRNSIServicio servicioRNSI = new ItemRNSIServicio();

    public ItemRNSIController() throws IOException {
    }


    @PostMapping("/item-rnsi")
    @ResponseBody
    public ItemReporteModelo rnsiItem(@RequestBody InfoComprasUIA reporte) throws IOException {
        System.out.println("Probando RNSIController");
        return servicioRNSI.agregaRNSIItem(reporte);
    }

}