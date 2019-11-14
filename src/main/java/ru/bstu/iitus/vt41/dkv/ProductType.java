package ru.bstu.iitus.vt41.dkv;

import ru.bstu.iitus.vt41.dkv.products.*;

public enum ProductType {
    Электроника {
        public Product factoryMethod ( ) {
            return new Electronics();
        }
    },
    Телевизор {
        public Product factoryMethod ( ) {
            return new TV();
        }
    },
    Камера {
        public Product factoryMethod ( ) {
            return new Camera ();
        }
    },
    Молочный {
        public Product factoryMethod ( ) {
            return new Milky();
        }
    },
    Сыр {
        public Product factoryMethod ( ) {
            return new Cheese();
        }
    },
    Игрушка {
        public Product factoryMethod ( ) {
            return new Toy();
        }
    },
    КубикРубика {
        public Product factoryMethod ( ) {
            return new Rubika();
        }
    },
    Экзамен {
        public Product factoryMethod ( ) {
            return new Exam();
        }
    },
    ИнтерфейсыВычислительныхСистем {
        public Product factoryMethod ( ) {
            return new CI();
        }
    };

    public abstract Product factoryMethod ( );
}
