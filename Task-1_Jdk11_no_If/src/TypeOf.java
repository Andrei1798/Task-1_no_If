public enum TypeOf {
    STRING, CHARACTER, INTEGER, DOUBLE, PERSON;
    public static TypeOf typeOf(Object obj){
        String g = obj.getClass().getSimpleName();
        TypeOf type = TypeOf.valueOf(g.toUpperCase());
        return switch (type){
            case CHARACTER -> CHARACTER;
            case DOUBLE -> DOUBLE;
            case PERSON -> PERSON;
            case STRING -> STRING;
            case INTEGER -> INTEGER;
        };
    }
}
