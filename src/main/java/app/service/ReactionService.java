package app.service;

import app.entity.Reaction;
import app.repository.ReactionRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReactionService {

    private final ReactionRepo reactionRepo;

    public void save(Reaction reaction){
        reactionRepo.save(reaction);
    }

    public Reaction getByAnswerId(long id){
        return reactionRepo.findByAnswer_Id(id);
    }

//    public List<Reaction> getReactionsByUIdAndAnswerId(long uid, long aid){
//        return reactionRepo.findAllByUser_IdAndAnswer_IdAndBad(uid, aid);
//    }
}
