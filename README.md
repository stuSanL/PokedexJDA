
# 🏆 PokedexJDA

---

## Material do minicurso 📖

- [Slides](https://www.canva.com/design/DAG2VyxGyNU/4ZjURaIBXrrobF3RW0hNqQ/view?utm_content=DAG2VyxGyNU&utm_campaign=designshare&utm_medium=link2&utm_source=uniquelinks&utlId=hdeed28bbf5)
- [Resumo da aula 1](https://docs.google.com/document/d/1ClhS7I11RUGGhpUfvLGt0Waxb68bhQv9Jc8yWT4OzKo/edit?usp=sharing)

---

## Orientações ⚡ 

### 1. Perdeu a aula de introdução?  
Tudo bem, treinador — mas agora vai ter que correr atrás do XP perdido. 🏃‍♂️  
Dá uma passada no **resumo inicial**, é tipo o Centro Pokémon: cura teus erros e te deixa pronto pra próxima batalha.  
⚠️ **Não teremos tempo de repassar tudo de novo**, então prepare-se e evolua seu bot pro estágio 2.  
*(Se ainda tá com o JDA nível Magikarp, dá um “Splash” no resumo e bora evoluir pra Gyarados 🐉)*

---

### 2. Durante a aula  
- Acompanha o ritmo do grupo, mestre Pokémon! Não tenta capturar um erro da rota passada enquanto o resto tá enfrentando o próximo ginásio.  
- Se der bug (tipo um Zubat aparecendo do nada), anota rapidinho e pergunta pros instrutores.  
- Lembra: copiar código sem entender é como usar o ataque **Metronome** — pode sair qualquer coisa, inclusive desastre 💥  

---

### 3. Entre os colegas de jornada  
- Se alguém travar, dá aquele “Potion” de ajuda — mas sem roubar o protagonismo da batalha.
- E, por favor, respeitem o ritmo dos outros. Nem todo mundo tem um Pikachu nível 100 no time. ⚡  

---

### 4. Resumo da PokéAventura  
- Seja ágil, curioso e preparado pra capturar bugs raros.  
- Nosso lema aqui é: **“Errar é humano, mas fazer o bot responder é lendário.”** ✨  
- E se nada funcionar... reinicia a IDE. É o equivalente a mandar o Snorlax dormir pra resetar o dia 😴  

## Códigos

```
@Override
    public void onButtonInteraction(@NotNull ButtonInteractionEvent event) {
        String componentId = event.getComponentId();
        int totalPokemon = ps.getpokemons().size();
        int totalPages = (int) Math.ceil(totalPokemon / (double) pokemonPorPag);

        if(componentId.startsWith("search")){

            TextInput ti = TextInput
                    .create("pageid", TextInputStyle.SHORT)
                    .setPlaceholder("ID da pagina a ser procurada")
                    .build();
            Modal md = Modal
                    .create("search","search")
                    .addComponents(
                            Label.of("Type Page ID:", ti)
                    )
                    .build();
            event.replyModal(md).queue();

        } else if (componentId.startsWith("next:") || componentId.startsWith("prev:")) {
            String[] parts = componentId.split(":");
            String action = parts[0];
            int currentPage = Integer.parseInt(parts[1]);

            if (action.equals("next")) {
                currentPage++;
            } else if (action.equals("prev")) {
                currentPage--;
            }

            editMessagePokedex(currentPage, totalPages, event);

        } else if(componentId.startsWith("start")){
            editMessagePokedex(0, totalPages, event);

        } else if(componentId.startsWith("end")){
            editMessagePokedex(totalPages-1, totalPages, event);

        } else if(componentId.equals("close")){
            event.deferEdit().queue();
            event.getMessage().delete().queue();
        } else if(componentId.startsWith("view")){
            int id = Integer.parseInt(componentId.replace("view:", ""));
            event.editComponents(Container.of(pokemonView(id))).useComponentsV2().queue();
        } else if(componentId.startsWith("back")){
            int page = (Integer.parseInt(componentId.replace("back:", ""))-1) / pokemonPorPag;
            editMessagePokedex(page, totalPages, event);
        }
    }

    @Override
    public void onModalInteraction(@NotNull ModalInteractionEvent event) {
        String componentId = event.getModalId();
        int totalPokemon = ps.getpokemons().size();
        int paginas = (totalPokemon / pokemonPorPag) + (totalPokemon % pokemonPorPag == 0 ? 0 : 1);
        if(componentId.equals("search")){
            try{
                int currentPage = -1 + Integer.parseInt(Objects.requireNonNull(event.getValue("pageid")).getAsString());
                if(currentPage < 0 || currentPage > paginas) throw new IllegalArgumentException();
                editMessagePokedex(currentPage, paginas, event);
            } catch (IllegalArgumentException e){
                event.reply("Insira um argumento válido! ").setEphemeral(true).queue();
            }

        }
    }
```
