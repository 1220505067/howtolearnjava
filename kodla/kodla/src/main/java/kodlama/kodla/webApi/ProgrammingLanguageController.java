package kodlama.kodla.webApi;

import kodlama.kodla.business.abstracts.ProgrammingLanguageService;
import kodlama.kodla.entities.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;


    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService){
        this.programmingLanguageService = programmingLanguageService;
    }
    @GetMapping("/getall")
        public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }
    @DeleteMapping("/delete")//http delete requesti
    public void delete(ProgrammingLanguage programmingLanguage){
        programmingLanguageService.delete(programmingLanguage);

    }
    @PostMapping("/add")//http post requesti
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }
    @PutMapping("/update")//http put requesti
    public void update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.update(programmingLanguage);
    }
}
