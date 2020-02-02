/*
 * Perro.java
 *
 * Generated with Matisse Schema Definition Language 9.1.12
 * Generation date: Sun Jan 26 21:03:38 2020
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package animales;

import com.matisse.reflect.*;

/**
 * <code>Perro</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Perro extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.12
     * Generation Date: Sun Jan 26 21:03:38 2020
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Perro</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("Animales.Perro"));

    /**
     * Gets the <code>Perro</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public Perro(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Perro(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Perro.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Perro.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(Perro.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Perro.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'nombre' */

    /** Attribute <code>nombre</code> cache ID */
    private static int nombreCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("nombre",CID));

    /**
     * Gets the <code>nombre</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNombreAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(nombreCID);
    }


    /**
     * Gets the <code>nombre</code> attribute value.
     * @return the value
     *
     * @see #setNombre
     * @see #removeNombre
     */
    public final String getNombre() {
        return getString(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>nombre</code> attribute value.
     * @param val the new value
     *
     * @see #getNombre
     * @see #removeNombre
     */
    public final void setNombre(String val) {
        setString(getNombreAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>nombre</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final void removeNombre() {
        removeValue(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final boolean isNombreNull() {
        return isNull(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final boolean isNombreDefaultValue() {
        return isDefaultValue(getNombreAttribute(getMtDatabase()));
    }


    /* Attribute 'raza' */

    /** Attribute <code>raza</code> cache ID */
    private static int razaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("raza",CID));

    /**
     * Gets the <code>raza</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getRazaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(razaCID);
    }


    /**
     * Gets the <code>raza</code> attribute value.
     * @return the value
     *
     * @see #setRaza
     * @see #removeRaza
     */
    public final String getRaza() {
        return getString(getRazaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>raza</code> attribute value.
     * @param val the new value
     *
     * @see #getRaza
     * @see #removeRaza
     */
    public final void setRaza(String val) {
        setString(getRazaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>raza</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getRaza
     * @see #setRaza
     */
    public final void removeRaza() {
        removeValue(getRazaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getRaza
     * @see #setRaza
     */
    public final boolean isRazaNull() {
        return isNull(getRazaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getRaza
     * @see #setRaza
     */
    public final boolean isRazaDefaultValue() {
        return isDefaultValue(getRazaAttribute(getMtDatabase()));
    }


    /* Attribute 'edad' */

    /** Attribute <code>edad</code> cache ID */
    private static int edadCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("edad",CID));

    /**
     * Gets the <code>edad</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getEdadAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(edadCID);
    }


    /**
     * Gets the <code>edad</code> attribute value.
     * @return the value
     *
     * @see #setEdad
     * @see #removeEdad
     */
    public final int getEdad() {
        return getInteger(getEdadAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>edad</code> attribute value.
     * @param val the new value
     *
     * @see #getEdad
     * @see #removeEdad
     */
    public final void setEdad(int val) {
        setInteger(getEdadAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>edad</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getEdad
     * @see #setEdad
     */
    public final void removeEdad() {
        removeValue(getEdadAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getEdad
     * @see #setEdad
     */
    public final boolean isEdadNull() {
        return isNull(getEdadAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getEdad
     * @see #setEdad
     */
    public final boolean isEdadDefaultValue() {
        return isDefaultValue(getEdadAttribute(getMtDatabase()));
    }


    /* Attribute 'personalidad' */

    /** Attribute <code>personalidad</code> cache ID */
    private static int personalidadCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("personalidad",CID));

    /**
     * Gets the <code>personalidad</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getPersonalidadAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(personalidadCID);
    }


    /**
     * Gets the <code>personalidad</code> attribute value.
     * @return the value
     *
     * @see #setPersonalidad
     * @see #removePersonalidad
     */
    public final String getPersonalidad() {
        return getString(getPersonalidadAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>personalidad</code> attribute value.
     * @param val the new value
     *
     * @see #getPersonalidad
     * @see #removePersonalidad
     */
    public final void setPersonalidad(String val) {
        setString(getPersonalidadAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>personalidad</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getPersonalidad
     * @see #setPersonalidad
     */
    public final void removePersonalidad() {
        removeValue(getPersonalidadAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getPersonalidad
     * @see #setPersonalidad
     */
    public final boolean isPersonalidadNull() {
        return isNull(getPersonalidadAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getPersonalidad
     * @see #setPersonalidad
     */
    public final boolean isPersonalidadDefaultValue() {
        return isDefaultValue(getPersonalidadAttribute(getMtDatabase()));
    }


    /* Attribute 'castrado' */

    /** Attribute <code>castrado</code> cache ID */
    private static int castradoCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("castrado",CID));

    /**
     * Gets the <code>castrado</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getCastradoAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(castradoCID);
    }


    /**
     * Gets the <code>castrado</code> attribute value.
     * @return the value
     *
     * @see #setCastrado
     * @see #removeCastrado
     */
    public final boolean getCastrado() {
        return getBoolean(getCastradoAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>castrado</code> attribute value.
     * @param val the new value
     *
     * @see #getCastrado
     * @see #removeCastrado
     */
    public final void setCastrado(boolean val) {
        setBoolean(getCastradoAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>castrado</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getCastrado
     * @see #setCastrado
     */
    public final void removeCastrado() {
        removeValue(getCastradoAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getCastrado
     * @see #setCastrado
     */
    public final boolean isCastradoNull() {
        return isNull(getCastradoAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getCastrado
     * @see #setCastrado
     */
    public final boolean isCastradoDefaultValue() {
        return isDefaultValue(getCastradoAttribute(getMtDatabase()));
    }


    /* Attribute 'masculino' */

    /** Attribute <code>masculino</code> cache ID */
    private static int masculinoCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("masculino",CID));

    /**
     * Gets the <code>masculino</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getMasculinoAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(masculinoCID);
    }


    /**
     * Gets the <code>masculino</code> attribute value.
     * @return the value
     *
     * @see #setMasculino
     * @see #removeMasculino
     */
    public final boolean getMasculino() {
        return getBoolean(getMasculinoAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>masculino</code> attribute value.
     * @param val the new value
     *
     * @see #getMasculino
     * @see #removeMasculino
     */
    public final void setMasculino(boolean val) {
        setBoolean(getMasculinoAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>masculino</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getMasculino
     * @see #setMasculino
     */
    public final void removeMasculino() {
        removeValue(getMasculinoAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getMasculino
     * @see #setMasculino
     */
    public final boolean isMasculinoNull() {
        return isNull(getMasculinoAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getMasculino
     * @see #setMasculino
     */
    public final boolean isMasculinoDefaultValue() {
        return isDefaultValue(getMasculinoAttribute(getMtDatabase()));
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public Perro(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Perro]";
    }
}
