package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PreviewImageView
  extends LinearLayout
  implements w
{
  private final Context context;
  private List<String> fIU;
  private TableLayout qEi;
  private final Map<Integer, View> qEj;
  private final Map<Integer, TableRow> qEk;
  private final int qEl;
  private HashMap<String, Bitmap> qEm;
  private w.a qEn;
  private boolean qEo;
  private boolean qEp;
  
  public PreviewImageView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8702409048064L, 64838);
    this.fIU = new ArrayList();
    this.qEj = new HashMap();
    this.qEk = new HashMap();
    this.qEm = new HashMap();
    this.qEl = 4;
    this.qEo = true;
    this.qEp = false;
    this.context = paramContext;
    init();
    GMTrace.o(8702409048064L, 64838);
  }
  
  public PreviewImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8702274830336L, 64837);
    this.fIU = new ArrayList();
    this.qEj = new HashMap();
    this.qEk = new HashMap();
    this.qEm = new HashMap();
    this.qEl = 4;
    this.qEo = true;
    this.qEp = false;
    this.context = paramContext;
    init();
    GMTrace.o(8702274830336L, 64837);
  }
  
  private void init()
  {
    GMTrace.i(8702543265792L, 64839);
    this.qEi = ((TableLayout)LayoutInflater.from(this.context).inflate(i.g.pPk, this, true).findViewById(i.f.content));
    GMTrace.o(8702543265792L, 64839);
  }
  
  public final void a(w.a parama)
  {
    GMTrace.i(15996337258496L, 119182);
    this.qEn = parama;
    GMTrace.o(15996337258496L, 119182);
  }
  
  public final void blF()
  {
    GMTrace.i(15996068823040L, 119180);
    this.qEo = false;
    GMTrace.o(15996068823040L, 119180);
  }
  
  public final void by(List<String> paramList)
  {
    GMTrace.i(8702677483520L, 64840);
    long l = System.currentTimeMillis();
    if (paramList == null)
    {
      GMTrace.o(8702677483520L, 64840);
      return;
    }
    this.fIU = paramList;
    int i = 0;
    this.qEi.removeAllViews();
    int m = paramList.size() + 1;
    int j = 0;
    TableRow localTableRow;
    if (i < m)
    {
      localTableRow = (TableRow)this.qEk.get(Integer.valueOf(j));
      if (localTableRow != null) {
        break label546;
      }
      localTableRow = new TableRow(this.context);
      this.qEk.put(Integer.valueOf(j), localTableRow);
    }
    label258:
    label315:
    label408:
    label504:
    label546:
    for (;;)
    {
      localTableRow.removeAllViews();
      int k = 0;
      if ((k < 4) && (i < m)) {
        if (i >= 9) {
          i += 1;
        }
      }
      for (;;)
      {
        if (localTableRow.getChildCount() > 0) {
          this.qEi.addView(localTableRow);
        }
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PreviewImageView", "initlist time : " + (System.currentTimeMillis() - l));
        j += 1;
        break;
        Object localObject2 = (View)this.qEj.get(Integer.valueOf(i));
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = View.inflate(this.context, i.g.pPl, null);
          this.qEj.put(Integer.valueOf(i), localObject1);
        }
        ImageView localImageView;
        if (i == m - 1)
        {
          localObject2 = "";
          localImageView = (ImageView)((View)localObject1).findViewById(i.f.pKk);
          if (i != m - 1) {
            break label408;
          }
          if (this.qEo)
          {
            localImageView.setBackgroundResource(i.e.pHv);
            localImageView.setContentDescription(getContext().getString(i.j.pRG));
            localImageView.setImageDrawable(null);
            if (this.qEn != null)
            {
              if (i != m - 1) {
                break label504;
              }
              ((View)localObject1).setTag(Integer.valueOf(-1));
              ((View)localObject1).setOnClickListener(this.qEn.qBP);
              ((View)localObject1).setClickable(true);
            }
          }
        }
        for (;;)
        {
          ((View)localObject1).setLayoutParams(new TableRow.LayoutParams(-2, -2));
          localTableRow.addView((View)localObject1);
          i += 1;
          k += 1;
          break;
          localObject2 = (String)paramList.get(i);
          break label258;
          localImageView.setBackgroundDrawable(null);
          localImageView.setTag(localObject2);
          localImageView.setContentDescription(getContext().getString(i.j.pSD));
          Bitmap localBitmap = (Bitmap)this.qEm.get(localObject2);
          if (!i.m(localBitmap))
          {
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PreviewImageView", "bm is null");
            new a(localImageView, (String)localObject2).m(new String[] { "" });
            break label315;
          }
          localImageView.setImageBitmap(localBitmap);
          break label315;
          ((View)localObject1).setTag(Integer.valueOf(i));
          ((View)localObject1).setOnClickListener(this.qEn.qBP);
          ((View)localObject1).setClickable(true);
        }
        GMTrace.o(8702677483520L, 64840);
        return;
      }
    }
  }
  
  public final void clean()
  {
    GMTrace.i(15996471476224L, 119183);
    this.qEp = true;
    Iterator localIterator = this.qEm.values().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)localIterator.next();
      if (i.m(localBitmap)) {
        localBitmap.recycle();
      }
    }
    GMTrace.o(15996471476224L, 119183);
  }
  
  public final View getView()
  {
    GMTrace.i(15996203040768L, 119181);
    GMTrace.o(15996203040768L, 119181);
    return this;
  }
  
  final class a
    extends h<String, Integer, Boolean>
  {
    private ImageView fDY;
    private Bitmap hkH;
    private String path;
    
    public a(ImageView paramImageView, String paramString)
    {
      GMTrace.i(8333176078336L, 62087);
      this.fDY = paramImageView;
      this.path = paramString;
      GMTrace.o(8333176078336L, 62087);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae bgG()
    {
      GMTrace.i(8333310296064L, 62088);
      com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.bha();
      GMTrace.o(8333310296064L, 62088);
      return localae;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/PreviewImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */