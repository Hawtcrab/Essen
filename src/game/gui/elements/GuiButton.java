package game.gui.elements;

import game.GameObject;
import game.characters.BaseCharacter;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class GuiButton {
    Consumer<GameObject> onPress;
    Predicate<GameObject> mayPress;
}
