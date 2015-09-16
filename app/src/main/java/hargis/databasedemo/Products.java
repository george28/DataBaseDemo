package hargis.databasedemo;

/**
 * Created by 660162328 on 9/16/2015.
 */
public class Products {
    private int _id;
    private String _productname;



    public Products(){

    }

    public Products(String _productname) {
        this._productname = _productname;
    }


    public String get_productname() {
        return _productname;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {

        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
