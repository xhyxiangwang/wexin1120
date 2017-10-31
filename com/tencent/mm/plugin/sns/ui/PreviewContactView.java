package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
public class PreviewContactView
  extends LinearLayout
{
  private final Context context;
  private List<String> fIU;
  private TableLayout qEi;
  private final Map<Integer, View> qEj;
  @SuppressLint({"UseSparseArrays"})
  private final Map<Integer, TableRow> qEk;
  private final int qEl;
  
  public PreviewContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8351027036160L, 62220);
    this.fIU = new ArrayList();
    this.qEj = new HashMap();
    this.qEk = new HashMap();
    this.qEl = 5;
    this.context = paramContext;
    this.qEi = ((TableLayout)LayoutInflater.from(this.context).inflate(i.g.pPk, this, true).findViewById(i.f.content));
    GMTrace.o(8351027036160L, 62220);
  }
  
  public final void bz(List<String> paramList)
  {
    GMTrace.i(8351161253888L, 62221);
    if (paramList == null)
    {
      GMTrace.o(8351161253888L, 62221);
      return;
    }
    this.fIU = paramList;
    this.qEi.removeAllViews();
    if (paramList.size() == 0)
    {
      GMTrace.o(8351161253888L, 62221);
      return;
    }
    int m = paramList.size();
    int j = 0;
    int i = 0;
    TableRow localTableRow;
    if (i < m)
    {
      localTableRow = (TableRow)this.qEk.get(Integer.valueOf(j));
      if (localTableRow != null) {
        break label295;
      }
      localTableRow = new TableRow(this.context);
      this.qEk.put(Integer.valueOf(j), localTableRow);
    }
    label295:
    for (;;)
    {
      localTableRow.removeAllViews();
      int k = 0;
      while ((k < 5) && (i < m))
      {
        Object localObject2 = (View)this.qEj.get(Integer.valueOf(i));
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = View.inflate(this.context, i.g.pPj, null);
          this.qEj.put(Integer.valueOf(i), localObject1);
        }
        localObject2 = (String)paramList.get(i);
        ImageView localImageView = (ImageView)((View)localObject1).findViewById(i.f.pKk);
        localImageView.setBackgroundDrawable(null);
        a.b.a(localImageView, (String)localObject2);
        ((View)localObject1).setTag(Integer.valueOf(0));
        ((View)localObject1).setClickable(false);
        localTableRow.addView((View)localObject1);
        k += 1;
        i += 1;
      }
      this.qEi.addView(localTableRow);
      j += 1;
      break;
      GMTrace.o(8351161253888L, 62221);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/PreviewContactView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */