package com.dmitryprod.testdatarest.config;

import com.dmitryprod.testdatarest.entity.Card;
import com.dmitryprod.testdatarest.entity.User;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CardEntityProcessor implements RepresentationModelProcessor<EntityModel<Card>> {

    @Override
    public EntityModel<Card> process(EntityModel<Card> model) {
        return EntityModel.of(model.getContent());
    }
}
