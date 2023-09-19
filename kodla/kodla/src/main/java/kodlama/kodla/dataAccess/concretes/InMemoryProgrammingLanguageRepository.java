package kodlama.kodla.dataAccess.concretes;

import kodlama.kodla.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.kodla.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository(){
        List<ProgrammingLanguage> _programmingLanguages = new ArrayList<>();

        _programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
        _programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
        _programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
        programmingLanguages = _programmingLanguages;
    }





    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);

    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage otherProgrammingLanguage:programmingLanguages){
            if (otherProgrammingLanguage.getId()==programmingLanguage.getId()){
                programmingLanguages.remove(programmingLanguage);
            }
        }
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage currentProgrammingLanguage = getById(programmingLanguage.getId());
        if (currentProgrammingLanguage!=null){
            currentProgrammingLanguage.setName(programmingLanguage.getName());
        }
    }
    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }
    public ProgrammingLanguage getById(int id){
        for (ProgrammingLanguage programmingLanguage:programmingLanguages){
            if (programmingLanguage.getId()==id){
                return programmingLanguage;
            }
        }
        return null ;
    }



}
