package kodlama.kodla.business.concretes;

import kodlama.kodla.business.abstracts.ProgrammingLanguageService;
import kodlama.kodla.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.kodla.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public  ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }
@Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception{
        if(programmingLanguage.getName().equals(null) || programmingLanguage.getName().equals("")) {
            throw new Exception("Programlama dili adı boş bırakılamaz");
        }
        for (ProgrammingLanguage otherProgrammingLanguage:programmingLanguageRepository.getAll()){
            if (otherProgrammingLanguage.getName().equals(programmingLanguage.getName ())||otherProgrammingLanguage.getId()==programmingLanguage.getId()){
                throw new Exception("Tekrarlayan veri girilemez");
            }
        }
        programmingLanguageRepository.add(programmingLanguage);
    }



    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.delete(programmingLanguage);
    }
    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }
    @Override
    public ProgrammingLanguage getById(int id){
        return programmingLanguageRepository.getById(id);
    }
    @Override
    public void update(ProgrammingLanguage programmingLanguage)throws Exception {
        if (programmingLanguage.getName().equals(null) || programmingLanguage.getName().equals("")) {
            throw new Exception("Programlama dili adı boş bırakılamaz");
        }
        for (ProgrammingLanguage otherProgrammingLanguage : programmingLanguageRepository.getAll()) {
            if (otherProgrammingLanguage.getName().equals(programmingLanguage.getName()) ) {
                throw new Exception("Tekrarlayan veri girilemez");
            }
        }
        programmingLanguageRepository.update(programmingLanguage);


    }
}
