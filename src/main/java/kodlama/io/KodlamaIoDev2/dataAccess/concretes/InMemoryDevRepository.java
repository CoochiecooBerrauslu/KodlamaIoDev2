package kodlama.io.KodlamaIoDev2.dataAccess.concretes;

import kodlama.io.KodlamaIoDev2.business.abstracts.IDevService;
import kodlama.io.KodlamaIoDev2.dataAccess.abstracts.IDevRepository;
import kodlama.io.KodlamaIoDev2.entities.concretes.CodeDevs;
import org.springframework.stereotype.Repository;

import java.util.*;

public class InMemoryDevRepository {
    @Repository
    public class InMemoryDevsRepository implements IDevService, IDevRepository {
        private static List<CodeDevs> codeDevs;
        HashMap<Integer,String> maps;// we gave this here for being able to use its method

        public InMemoryDevsRepository() throws Exception {
            codeDevs = new ArrayList<CodeDevs>();
            codeDevs.add(new CodeDevs("Pyhton"));
            codeDevs.add(new CodeDevs("C#"));
            codeDevs.add(new CodeDevs("Java"));
            codeDevs.add(new CodeDevs("C++"));
            codeDevs.add(new CodeDevs("Swift"));

            maps = new HashMap<Integer,String>();//creating HashMap
            maps.put(1,"Python");
            maps.put(2,"C#");
            maps.put(3,"Java");
            maps.put(4,"C++");
            maps.put(5,"Swift");
            for(int i = 1; i<=((CharSequence) maps).length(); i++){
                System.out.println(i);
            }
            for(CodeDevs codeDevs1 : codeDevs) {
                if(Objects.equals(((CodeDevs) codeDevs).getProgrammingLanguageName(),codeDevs1.getProgrammingLanguageName())) {
                    throw new Exception("You cannot enter the same programming language name twice.");
                }

            }
        }

        public InMemoryDevsRepository(List<CodeDevs> codeDevs, Map<Integer, String> maps) {
            this.codeDevs = codeDevs;
            this.maps = (HashMap<Integer, String>) maps;
        }
        @Override
        public void add(String data) {

            System.out.println("Programming Language"+ codeDevs +"Added.");

        }

        @Override
        public void update(String data) {

            System.out.println("Programming Language"+ codeDevs +"Updated.");
        }

        @Override
        public void delete(String data) {

            System.out.println("Programming Language"+ codeDevs +"Deleted.");

        }
        @Override
        public List<CodeDevs> getall() {

            return codeDevs;
        }
        @Override
        public Map<Integer, String> map() {

            return maps;
        }

    }
}
