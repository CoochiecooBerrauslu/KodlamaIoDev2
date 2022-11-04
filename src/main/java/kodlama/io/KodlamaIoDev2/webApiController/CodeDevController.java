package kodlama.io.KodlamaIoDev2.webApiController;
import kodlama.io.KodlamaIoDev2.business.abstracts.IDevService;
import kodlama.io.KodlamaIoDev2.entities.concretes.CodeDevs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public class CodeDevController {
    @RestController
@RequestMapping("/api/codeDevs")
    public class CodeDevsController {
        private IDevService iDevService;
       @Autowired
        public CodeDevsController(IDevService iDevService) {
            this.iDevService = iDevService;
        }
        @GetMapping("/getall")
        public List<CodeDevs> getall(){

            return  iDevService.getall();

        }
}
}
