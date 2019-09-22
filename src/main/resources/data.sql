INSERT INTO category (description)
VALUES ('American');
INSERT INTO category (description)
VALUES ('Italian');
INSERT INTO category (description)
VALUES ('Mexican');
INSERT INTO category (description)
VALUES ('Fast Food');

INSERT INTO unit_of_measure (description)
VALUES ('');
INSERT INTO unit_of_measure (description)
VALUES ('Teaspoon');
INSERT INTO unit_of_measure (description)
VALUES ('Tablespoon');
INSERT INTO unit_of_measure (description)
VALUES ('Cup');
INSERT INTO unit_of_measure (description)
VALUES ('Pinch');
INSERT INTO unit_of_measure (description)
VALUES ('Ounce');
INSERT INTO unit_of_measure (description)
VALUES ('Clove');
INSERT INTO unit_of_measure (description)
VALUES ('Dash');


INSERT INTO recipe (description, prep_time, cock_time, servings, directions,
                    url, difficulty)
VALUES ('Spicy Grilled Chicken Tacos', 20, 15, 5,
        '1. Prepare a gas or charcoal grill for medium-high, direct heat.\n 2. Make the marinade and coat the chicken: In a large bowl, stir together the chili powder, oregano, cumin, sugar, salt, garlic and orange zest. Stir in the orange juice and olive oil to make a loose paste. Add the chicken to the bowl and toss to coat all over.\nSet aside to marinate while the grill heats and you prepare the rest of the toppings.\n3. Grill the chicken: Grill the chicken for 3 to 4 minutes per side, or until a thermometer inserted into the thickest part of the meat registers 165F. Transfer to a plate and rest for 5 minutes.\n4. Warm the tortillas: Place each tortilla on the grill or on a hot, dry skillet over medium-high heat. As soon as you see pockets of the air start to puff up in the tortilla, turn it with tongs and heat for a few seconds on the other side.\n Wrap warmed tortillas in a tea towel to keep them warm until serving.\n5. Assemble the tacos: Slice the chicken into strips. On each tortilla, place a small handful of arugula. Top with chicken slices, sliced avocado, radishes, tomatoes, and onion slices. Drizzle with the thinned sour cream. Serve with lime wedges.',
        'https://www.simplyrecipes.com/recipes/spicy_grilled_chicken_tacos',
        'MODERATE');
INSERT INTO recipe (description, prep_time, cock_time, servings, directions,
                    url, difficulty)
VALUES ('Perfect Guacamole', 10, 1, 4,
        '1. Cut avocado, remove flesh: Cut the avocados in half. Remove seed. Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon. Place in a bowl.\n 2. Mash with a fork: Using a fork, roughly mash the avocado. (Don''t overdo it! The guacamole should be a little chunky.)\n 3. Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. The acid in the lime juice will provide some balance to the richness of the avocado and will help delay the avocados from turning brown.\nAdd the chopped onion, cilantro, black pepper, and chiles. Chili peppers vary individually in their hotness. So, start with a half of one chili pepper and add to the guacamole to your desired degree of hotness.\nRemember that much of this is done to taste because of the variability in the fresh ingredients. Start with this recipe and adjust to your taste.\n4. Cover with plastic and chill to store: Place plastic wrap on the surface of the guacamole cover it and to prevent air reaching it. (The oxygen in the air causes oxidation which will turn the guacamole brown.) Refrigerate until ready to serve.\nChilling tomatoes hurts their flavor, so if you want to add chopped tomato to your guacamole, add it just before serving.',
        'https://www.simplyrecipes.com/recipes/perfect_guacamole', 'EASY');


INSERT INTO notes (notes, recipe_id)
VALUES ('Look for ancho chile powder with the Mexican ingredients at your grocery store, on buy it online. (If you cannot find ancho chili powder, you replace the ancho chili, the oregano, and the cumin with 2 0.5 tablespoons regular chili powder, though the flavor wont be quite the same.)',
        1);
INSERT INTO notes (notes, recipe_id)
VALUES ('Guacamole, a dip made from avocados, is originally from Mexico. The name is derived from two Aztec Nahuatl words—ahuacatl (avocado) and molli (sauce).',
        2);

UPDATE recipe SET notes_id = 1 WHERE id = 1;
UPDATE recipe SET notes_id = 2 WHERE id = 2;


INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('ancho chili powder', 2, 3, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('dried oregano', 1, 2, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('dried cumin', 1, 2, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('sugar', 1, 2, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('salt', 0.5, 2, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('finely chopped clove garlic', 1, 7, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('orange zest', 1, 3, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('fresh-squeezed orange juice', 3, 3, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('olive oil', 2, 3, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('skinless, boneless chicken thighs', 5, 1, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('small corn tortillas', 8, 1, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('packed baby arugula', 3, 4, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('sliced medium ripe avocados', 2, 1, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('thinly sliced radishes', 4, 1, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('halved pint cherry tomatoes', 0.5, 4, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('thinly sliced red onion', 0.25, 4, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('roughly chopped cilantro', 1, 1, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('sour cream thinned', 0.5, 4, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('milk', 0.25, 4, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('lime cut into wedges', 1, 1, 1);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('ripe avocados', 2, 1, 2);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('Kosher salt', 0.5, 2, 2);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('fresh lime juice', 1, 3, 2);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('minced red onion', 2, 3, 2);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('minced serrano chiles, stems and seeds removed', 2, 1, 2);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('finely chopped cilantro (leaves and tender stems)', 2, 3, 2);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('freshly grated black pepper', 1, 8, 2);
INSERT INTO ingredient (description, amount, uom_id, recipe_id)
VALUES ('chopped ripe tomato, seeds and pulp removed', 0.5, 1, 2);


INSERT INTO recipe_category (recipe_id, category_id)
VALUES (1, 3);
INSERT INTO recipe_category (recipe_id, category_id)
VALUES (2, 3);
