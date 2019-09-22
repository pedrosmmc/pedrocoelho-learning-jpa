package com.pedrocoelho.learningjpa.bootstrap;

import com.pedrocoelho.learningjpa.model.*;
import com.pedrocoelho.learningjpa.repositories.CategoryRepository;
import com.pedrocoelho.learningjpa.repositories.RecipeRepository;
import com.pedrocoelho.learningjpa.repositories.UnitOfMeasureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private RecipeRepository recipeRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private CategoryRepository categoryRepository;

    public RecipeBootstrap(RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        UnitOfMeasure can = new UnitOfMeasure("Can");
        UnitOfMeasure squirt = new UnitOfMeasure("Squirt");
        unitOfMeasureRepository.saveAll(Arrays.asList(can, squirt));

        Category spicy = new Category();
        spicy.setDescription("Spicy");
        categoryRepository.save(spicy);

        Notes n1 = new Notes();
        n1.setNotes("All you have to do is say these two words and I’m flooded with childhood memories. We kids are only a few feet high, have tiny feet, scabbed knees, and boundless energy.\n" +
                "In between chasing each other around the dining room table we are squealing to our mother, “We’re having tuna patties!”\n" +
                "We were enthusiastic about food, to say the least. And always hungry.\n" +
                "Back then, this was one of my mother’s go-to dishes. No idea what her recipe was, and it’s been so long since she’s made them, it’s long forgotten.\n" +
                "This recipe is as close as I can come to what I remember, probably with a few added flourishes.");

        Ingredient i1 = new Ingredient("Tuna", new BigDecimal(2), getUom("Can"));
        Ingredient i2 = new Ingredient("Dijon mustard", new BigDecimal(2), getUom("Teaspoon"));
        Ingredient i3 = new Ingredient("white bread torn into small pieces",new BigDecimal(.5),getUom("Cup"));
        Ingredient i4 = new Ingredient();
        i4.setDescription("lemon zest");
        i4.setAmount(new BigDecimal(1));
        i4.setUom(getUom("Teaspoon"));
        Ingredient i5 = new Ingredient();
        i5.setDescription("lemon juice");
        i5.setAmount(new BigDecimal(1));
        i5.setUom(getUom("Tablespoon"));
        Ingredient i6 = new Ingredient();
        i6.setDescription("water");
        i6.setAmount(new BigDecimal(1));
        i6.setUom(getUom("Tablespoon"));
        Ingredient i7 = new Ingredient();
        i7.setDescription("chopped fresh parsley");
        i7.setAmount(new BigDecimal(2));
        i7.setUom(getUom("Tablespoon"));
        Ingredient i8 = new Ingredient();
        i8.setDescription("chopped fresh chives");
        i8.setAmount(new BigDecimal(2));
        i8.setUom(getUom("Tablespoon"));
        Ingredient i9 = new Ingredient();
        i9.setDescription("Salt");
        i9.setAmount(new BigDecimal(1));
        i9.setUom(getUom("Pinch"));
        Ingredient i10 = new Ingredient();
        i10.setDescription("black pepper");
        i10.setAmount(new BigDecimal(1));
        i10.setUom(getUom("Pinch"));
        Ingredient i11 = new Ingredient();
        i11.setDescription("tabasco");
        i11.setAmount(new BigDecimal(2));
        i11.setUom(getUom("Squirt"));
        Ingredient i12 = new Ingredient();
        i12.setDescription("raw egg");
        i12.setAmount(new BigDecimal(1));
        i12.setUom(getUom(""));
        Ingredient i13 = new Ingredient();
        i13.setDescription("extra virgin olive oil");
        i13.setAmount(new BigDecimal(2));
        i13.setUom(getUom("Tablespoon"));
        Ingredient i14 = new Ingredient();
        i14.setDescription("butter");
        i14.setAmount(new BigDecimal(.5));
        i14.setUom(getUom("Teaspoon"));

        Recipe r1 = new Recipe();
        r1.getCategories().add(getCategory("American"));
        r1.getCategories().add(getCategory("Spicy"));
        r1.setDescription("Tuna Patties");
        r1.setDifficulty(Difficulty.HARD);
        r1.setNotes(n1);
        r1.setPrepTime(10);
        r1.setCockTime(10);
        r1.setServings(4);
        r1.setDirections("1. Drain tuna: Drain the liquid from the tuna cans. If you are using tuna packed in water, reserve a Tablespoon of the tuna water, and add a teaspoon of olive oil to the tuna mixture in the next step.\n" +
                "\n" +
                "2. Mix tuna with mustard, bread, zest, lemon juice, water, parsley, chives, hot sauce, salt, pepper, egg: In a medium bowl, mix together the tuna, mustard, torn white bread, lemon zest, lemon juice, water, parsley, chives, and hot sauce. Sprinkle on salt and freshly ground black pepper. Taste the mixture before adding the egg to see if it needs more seasoning to your taste. Mix in the egg.\n" +
                "\n" +
                "3. Form into patties, chill: Divide the mixture into 4 parts. With each part, form into a ball and then flatten into a patty. Place onto a wax paper lined tray and chill for an hour. (You can skip the chilling if you want, chilling just helps the patties stay together when you cook them.)\n" +
                "4. Sauté in skillet: Heat the olive oil and a little butter (for taste) in a cast iron or stick-free skillet on medium high. Gently place the patties in the pan, and cook until nicely browned, 3-4 minutes on each side.\n" +
                "Serve with wedges of lemon. You can also serve with tartar sauce on slider buns for a tuna burger.");
        r1.setUrl("https://www.simplyrecipes.com/recipes/tuna_patties");
        Ingredient[] ingredients1 = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14};
        for (Ingredient i : ingredients1)
            i.setRecipe(r1);
        r1.getIngredients().addAll(Arrays.asList(ingredients1));
        recipeRepository.save(r1);
    }

    private UnitOfMeasure getUom(String description) {
        Optional<UnitOfMeasure> optUom = unitOfMeasureRepository.findByDescription(description);
        if (optUom.isEmpty())
            throw new RuntimeException("Unit of measure " + description + " not found!");
        return optUom.get();
    }

    private Category getCategory(String description) {
        Optional<Category> optCat = categoryRepository.findByDescription(description);
        if (optCat.isEmpty())
            throw new RuntimeException("Category " + description + " not found!");
        return optCat.get();
    }
}
