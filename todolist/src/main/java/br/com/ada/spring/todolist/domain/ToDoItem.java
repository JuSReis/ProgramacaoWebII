package br.com.ada.spring.todolist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ToDoItem {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private Boolean concluida;
    private LocalDateTime dataHora;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ToDoItem toDoItem = (ToDoItem)  o;
//        return Objects.equals(id,toDoItem.id) && Objects.equals(titulo, toDoItem.titulo) && Objects.equals(descricao, toDoItem.descricao) && Objects.equals(concluida, toDoItem.concluida) && Objects.equals(dataHora, toDoItem.dataHora);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id,titulo,descricao,concluida,dataHora);
//    }

}
