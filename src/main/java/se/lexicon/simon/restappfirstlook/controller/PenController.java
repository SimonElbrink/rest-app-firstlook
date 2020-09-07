package se.lexicon.simon.restappfirstlook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.simon.restappfirstlook.model.Pen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class PenController {

    List<Pen> pens = Arrays.asList(
            new Pen(100, "Ball Pen", "2sd55gsd2", "PARKER"),
            new Pen(101, "Whiteboard Pen", "dsa554g", "PILOT")
    );

/*    @GetMapping("/pen")
    public Pen getPen(){
        return new Pen(100, "ballpen", "2sd55gsd2", "PARKER");
    }
*/

    @GetMapping("/pen")
    public ResponseEntity<Pen> getPenResource(){

        Pen pen = new Pen(100, "Ballpen", "2sd55gsd2", "PARKER");

        return ResponseEntity.status(HttpStatus.OK).body(pen);
    }

    @GetMapping("/pens")
    public ResponseEntity<List<Pen>> getAllPens(){

        return ResponseEntity.ok(pens);
    }

    @GetMapping("/pen/{id}")
    public ResponseEntity<Pen> getPenById(@PathVariable("id") int id){

        Optional<Pen> optionalPen = Optional.empty();

        for (Pen p: pens) {
            if (p.getId() == id){
                optionalPen = Optional.ofNullable(p);

            }
        }

        if (optionalPen.isPresent()){
            return ResponseEntity.ok(optionalPen.get());
        } else{
            return ResponseEntity.notFound().build();
        }

    }







}
