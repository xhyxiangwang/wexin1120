package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MallOrderDetailObject
{
  public String fBG;
  public String lwz;
  public MallTransactionObject oqE;
  public b oqF;
  public ArrayList<ProductSectionItem> oqG;
  public List<a> oqH;
  public List<HelpCenter> oqI;
  int oqJ;
  public String oqK;
  public String oqL;
  public int oqM;
  
  public MallOrderDetailObject()
  {
    GMTrace.i(6625658142720L, 49365);
    this.oqI = new LinkedList();
    this.oqJ = -1;
    GMTrace.o(6625658142720L, 49365);
  }
  
  static ArrayList<ProductSectionItem> G(JSONObject paramJSONObject)
  {
    GMTrace.i(6625792360448L, 49366);
    paramJSONObject = paramJSONObject.getJSONObject("product_section");
    if (paramJSONObject == null)
    {
      GMTrace.o(6625792360448L, 49366);
      return null;
    }
    paramJSONObject = paramJSONObject.getJSONArray("items");
    if ((paramJSONObject == null) || (paramJSONObject.length() == 0))
    {
      GMTrace.o(6625792360448L, 49366);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i < paramJSONObject.length())
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        ProductSectionItem localProductSectionItem = new ProductSectionItem();
        localProductSectionItem.iconUrl = localJSONObject.optString("icon_url");
        localProductSectionItem.name = localJSONObject.optString("name");
        try
        {
          localProductSectionItem.osv = H(localJSONObject);
          localProductSectionItem.count = localJSONObject.optInt("count");
          localProductSectionItem.osw = localJSONObject.optString("price");
          localProductSectionItem.jumpUrl = localJSONObject.optString("jump_url");
          localProductSectionItem.osx = localJSONObject.optString("pid");
          localProductSectionItem.scene = localJSONObject.optInt("scene");
          localArrayList.add(localProductSectionItem);
          i += 1;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.MallOrderDetailObject", localJSONException, "", new Object[0]);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.MallOrderDetailObject", localException, "", new Object[0]);
          }
        }
      }
    }
    GMTrace.o(6625792360448L, 49366);
    return localArrayList;
  }
  
  private static List<ProductSectionItem.Skus> H(JSONObject paramJSONObject)
  {
    GMTrace.i(6625926578176L, 49367);
    paramJSONObject = paramJSONObject.getJSONArray("skus");
    if ((paramJSONObject == null) || (paramJSONObject.length() == 0))
    {
      GMTrace.o(6625926578176L, 49367);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramJSONObject.length())
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
      ProductSectionItem.Skus localSkus = new ProductSectionItem.Skus();
      localSkus.amo = localJSONObject.optString("key");
      localSkus.value = localJSONObject.optString("value");
      localArrayList.add(localSkus);
      i += 1;
    }
    GMTrace.o(6625926578176L, 49367);
    return localArrayList;
  }
  
  public static class HelpCenter
    implements Parcelable
  {
    public static final Parcelable.Creator<HelpCenter> CREATOR;
    public boolean fvj;
    public String name;
    public String url;
    
    static
    {
      GMTrace.i(6623779094528L, 49351);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6623779094528L, 49351);
    }
    
    protected HelpCenter()
    {
      GMTrace.i(6623242223616L, 49347);
      GMTrace.o(6623242223616L, 49347);
    }
    
    protected HelpCenter(Parcel paramParcel)
    {
      GMTrace.i(6623376441344L, 49348);
      this.name = paramParcel.readString();
      this.url = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.fvj = bool;
        GMTrace.o(6623376441344L, 49348);
        return;
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(6623644876800L, 49350);
      GMTrace.o(6623644876800L, 49350);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6623510659072L, 49349);
      paramParcel.writeString(this.name);
      paramParcel.writeString(this.url);
      if (this.fvj) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        GMTrace.o(6623510659072L, 49349);
        return;
      }
    }
  }
  
  public static final class a
  {
    public int jumpType;
    public String jumpUrl;
    public boolean knE;
    public String name;
    public int type;
    public String value;
    
    public a()
    {
      GMTrace.i(6630489980928L, 49401);
      this.type = 0;
      GMTrace.o(6630489980928L, 49401);
    }
  }
  
  public static final class b
  {
    public String mDg;
    public String oqN;
    public String oqO;
    public String thumbUrl;
    public int time;
    
    public b()
    {
      GMTrace.i(6626597666816L, 49372);
      GMTrace.o(6626597666816L, 49372);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/MallOrderDetailObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */