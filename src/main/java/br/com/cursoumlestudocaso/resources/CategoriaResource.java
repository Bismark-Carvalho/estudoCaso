package br.com.cursoumlestudocaso.resources;

import br.com.cursoumlestudocaso.domain.CategoriaDomain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<CategoriaDomain> listar() {
        CategoriaDomain cat1 = new CategoriaDomain("Informatica");
        CategoriaDomain cat2 = new CategoriaDomain("Escritorio");
        List<CategoriaDomain> categoriaDomainList = new ArrayList<>();
        categoriaDomainList.add(cat1);
        categoriaDomainList.add(cat2);

        return categoriaDomainList;
    }

}
