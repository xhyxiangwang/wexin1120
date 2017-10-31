package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.h;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c
  extends b
{
  private HashMap<String, Bitmap> qEm;
  boolean qEp;
  private int qVX;
  private boolean qVY;
  private boolean qVZ;
  a qWa;
  
  public c(Context paramContext, List<?> paramList, int paramInt, boolean paramBoolean, a parama)
  {
    super(paramContext, 4);
    GMTrace.i(15970030583808L, 118986);
    this.qEm = new HashMap();
    super.bD(bE(paramList));
    this.qVX = 9;
    this.qVY = paramBoolean;
    this.qWa = parama;
    boc();
    bod();
    GMTrace.o(15970030583808L, 118986);
  }
  
  private List<d> bE(List<?> paramList)
  {
    GMTrace.i(15970164801536L, 118987);
    ArrayList localArrayList = new ArrayList(paramList.size());
    int i = 0;
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = paramList.next();
      d locald = new d();
      locald.data = localObject;
      locald.id = i;
      localArrayList.add(locald);
      i += 1;
    }
    GMTrace.o(15970164801536L, 118987);
    return localArrayList;
  }
  
  private void boc()
  {
    GMTrace.i(15970299019264L, 118988);
    int i = 0;
    while (i < this.qVW)
    {
      d locald = new d();
      locald.data = "";
      locald.id = getCount();
      locald.id = getCount();
      add(i, locald);
      i += 1;
    }
    GMTrace.o(15970299019264L, 118988);
  }
  
  public final void bD(List<?> paramList)
  {
    GMTrace.i(15970701672448L, 118991);
    super.bD(bE(paramList));
    boc();
    bod();
    GMTrace.o(15970701672448L, 118991);
  }
  
  public final void bod()
  {
    GMTrace.i(15970433236992L, 118989);
    w.v("DynamicGridAdapter", "showAddImg %s, getCount %d, getHeaderCount %d, maxShowCount %d， showing %s", new Object[] { Boolean.valueOf(this.qVY), Integer.valueOf(getCount()), Integer.valueOf(this.qVW), Integer.valueOf(this.qVX), Boolean.valueOf(this.qVZ) });
    if ((this.qVY) && (boe() < this.qVX))
    {
      if (!this.qVZ)
      {
        this.qVZ = true;
        add("");
        GMTrace.o(15970433236992L, 118989);
      }
    }
    else {
      this.qVZ = false;
    }
    GMTrace.o(15970433236992L, 118989);
  }
  
  public final int boe()
  {
    GMTrace.i(15970835890176L, 118992);
    int j = getCount();
    int k = this.qVW;
    if (this.qVZ) {}
    for (int i = 1;; i = 0)
    {
      GMTrace.o(15970835890176L, 118992);
      return j - k - i;
    }
  }
  
  public final void clear()
  {
    GMTrace.i(15970567454720L, 118990);
    super.clear();
    this.qVZ = false;
    GMTrace.o(15970567454720L, 118990);
  }
  
  public final void dg(int paramInt1, int paramInt2)
  {
    GMTrace.i(15971372761088L, 118996);
    super.dg(paramInt1, paramInt2);
    if (this.qWa != null) {
      this.qWa.dc(paramInt1 - this.qVW, paramInt2 - this.qVW);
    }
    GMTrace.o(15971372761088L, 118996);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(16275912785920L, 121265);
    if (TextUtils.isEmpty(getItem(paramInt).toString()))
    {
      GMTrace.o(16275912785920L, 121265);
      return 1;
    }
    GMTrace.o(16275912785920L, 121265);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(15970970107904L, 118993);
    String str;
    ImageView localImageView;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(i.g.pPl, paramViewGroup, false);
      paramViewGroup = new b(paramView);
      paramView.setTag(i.f.pKg, paramViewGroup);
      str = getItem(paramInt).toString();
      localImageView = paramViewGroup.fBd;
      if (!TextUtils.isEmpty(str)) {
        break label196;
      }
      localImageView.setBackgroundColor(0);
      localImageView.setBackgroundDrawable(null);
      localImageView.setImageDrawable(null);
      localImageView.setBackgroundResource(i.e.pHv);
      localImageView.setContentDescription(paramViewGroup.fBd.getContext().getString(i.j.pRG));
      if (paramInt <= 0) {
        break label169;
      }
      paramViewGroup.view.setTag(Integer.valueOf(-1));
      label129:
      if (paramInt >= this.qVW) {
        break label312;
      }
      paramViewGroup.fBd.setVisibility(4);
    }
    for (;;)
    {
      GMTrace.o(15970970107904L, 118993);
      return paramView;
      paramViewGroup = (b)paramView.getTag(i.f.pKg);
      break;
      label169:
      if (paramInt >= paramViewGroup.qWb.qVW) {
        break label129;
      }
      paramViewGroup.view.setTag(Integer.valueOf(Integer.MAX_VALUE));
      break label129;
      label196:
      paramViewGroup.view.setTag(Integer.valueOf(paramInt - paramViewGroup.qWb.qVW));
      localImageView.setBackgroundDrawable(null);
      localImageView.setTag(str);
      localImageView.setContentDescription(paramViewGroup.fBd.getContext().getString(i.j.pSD));
      Bitmap localBitmap = (Bitmap)paramViewGroup.qWb.qEm.get(str);
      if (!i.m(localBitmap))
      {
        new c(paramViewGroup.qWb, localImageView, str).m(new String[] { "" });
        break label129;
      }
      localImageView.setImageBitmap(localBitmap);
      break label129;
      label312:
      paramViewGroup.fBd.setVisibility(0);
      paramView.setVisibility(0);
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(16276047003648L, 121266);
    GMTrace.o(16276047003648L, 121266);
    return 2;
  }
  
  public final boolean vk(int paramInt)
  {
    GMTrace.i(15971104325632L, 118994);
    if (paramInt < this.qVW)
    {
      GMTrace.o(15971104325632L, 118994);
      return false;
    }
    if (this.qVZ)
    {
      if (paramInt != getCount() - 1)
      {
        GMTrace.o(15971104325632L, 118994);
        return true;
      }
      GMTrace.o(15971104325632L, 118994);
      return false;
    }
    boolean bool = super.vk(paramInt);
    GMTrace.o(15971104325632L, 118994);
    return bool;
  }
  
  public final boolean vl(int paramInt)
  {
    GMTrace.i(15971238543360L, 118995);
    if (paramInt < this.qVW)
    {
      GMTrace.o(15971238543360L, 118995);
      return false;
    }
    if (this.qVZ)
    {
      if (paramInt != getCount() - 1)
      {
        GMTrace.o(15971238543360L, 118995);
        return true;
      }
      GMTrace.o(15971238543360L, 118995);
      return false;
    }
    boolean bool = super.vl(paramInt);
    GMTrace.o(15971238543360L, 118995);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void dc(int paramInt1, int paramInt2);
    
    public abstract void removeItem(int paramInt);
  }
  
  private final class b
  {
    public ImageView fBd;
    View view;
    
    public b(View paramView)
    {
      GMTrace.i(15992847597568L, 119156);
      this.view = paramView;
      this.fBd = ((ImageView)paramView.findViewById(i.f.pKk));
      GMTrace.o(15992847597568L, 119156);
    }
  }
  
  final class c
    extends h<String, Integer, Boolean>
  {
    private ImageView fDY;
    private Bitmap hkH;
    private String path;
    
    public c(ImageView paramImageView, String paramString)
    {
      GMTrace.i(15992310726656L, 119152);
      this.fDY = paramImageView;
      this.path = paramString;
      GMTrace.o(15992310726656L, 119152);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae bgG()
    {
      GMTrace.i(15992444944384L, 119153);
      com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.bha();
      GMTrace.o(15992444944384L, 119153);
      return localae;
    }
  }
  
  private final class d
  {
    public Object data;
    public int id;
    
    public d()
    {
      GMTrace.i(15991773855744L, 119148);
      GMTrace.o(15991773855744L, 119148);
    }
    
    public final int hashCode()
    {
      GMTrace.i(15992042291200L, 119150);
      int i = this.id;
      GMTrace.o(15992042291200L, 119150);
      return i;
    }
    
    public final String toString()
    {
      GMTrace.i(15991908073472L, 119149);
      String str = this.data.toString();
      GMTrace.o(15991908073472L, 119149);
      return str;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */