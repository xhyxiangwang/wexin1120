package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ay.d;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class FTSMainUIEducationLayoutWithAll
  extends FTSMainUIEducationLayout
{
  public FTSMainUIEducationLayoutWithAll(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16801912061952L, 125184);
    GMTrace.o(16801912061952L, 125184);
  }
  
  public FTSMainUIEducationLayoutWithAll(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16802046279680L, 125185);
    GMTrace.o(16802046279680L, 125185);
  }
  
  private void da(String paramString, int paramInt)
  {
    GMTrace.i(16802314715136L, 125187);
    LinearLayout localLinearLayout = (LinearLayout)inflate(getContext(), R.i.cVE, null);
    localLinearLayout.findViewById(R.h.cAx).setOnClickListener(this.pnn);
    ((TextView)localLinearLayout.findViewById(R.h.cAx)).setText(paramString);
    this.wGk.add(localLinearLayout);
    this.wGl.put(Integer.valueOf(paramInt), (TextView)localLinearLayout.findViewById(R.h.cAx));
    addView(localLinearLayout);
    GMTrace.o(16802314715136L, 125187);
  }
  
  protected final boolean Y(JSONObject paramJSONObject)
  {
    GMTrace.i(16802448932864L, 125188);
    if (paramJSONObject == null)
    {
      GMTrace.o(16802448932864L, 125188);
      return false;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("items");
    if (localJSONArray == null)
    {
      GMTrace.o(16802448932864L, 125188);
      return false;
    }
    String str2 = null;
    String str1 = null;
    Object localObject1 = null;
    Object localObject2 = null;
    int i;
    int j;
    label84:
    JSONObject localJSONObject;
    if (v.eq(ab.getContext()).equalsIgnoreCase("en"))
    {
      i = a.U(getContext(), R.f.aRc);
      j = 0;
      if (j >= localJSONArray.length()) {
        break label201;
      }
      localJSONObject = localJSONArray.optJSONObject(j);
      if (j % 3 != 0) {
        break label141;
      }
      str2 = localJSONObject.optString("hotword");
      localObject1 = localJSONObject;
    }
    for (;;)
    {
      j += 1;
      break label84;
      i = a.U(getContext(), R.f.aSh);
      break;
      label141:
      if (j % 3 == 1)
      {
        str1 = localJSONObject.optString("hotword");
        localObject2 = localJSONObject;
      }
      else
      {
        a(str2, localObject1, str1, localObject2, localJSONObject.optString("hotword"), localJSONObject, i);
        str2 = null;
        str1 = null;
        localObject1 = null;
        localObject2 = null;
      }
    }
    label201:
    if ((str2 != null) && (localObject1 != null)) {
      a(str2, localObject1, str1, localObject2, null, null, i);
    }
    paramJSONObject = paramJSONObject.optJSONArray("all");
    if ((paramJSONObject == null) || (paramJSONObject.length() == 0)) {
      ceG();
    }
    for (;;)
    {
      GMTrace.o(16802448932864L, 125188);
      return true;
      paramJSONObject = paramJSONObject.optJSONObject(0);
      da(paramJSONObject.optString("hotword"), paramJSONObject.optInt("businessType"));
    }
  }
  
  protected final void ceG()
  {
    GMTrace.i(16802180497408L, 125186);
    da(getContext().getResources().getString(R.l.eEO), d.a(null, getContext().getString(R.l.eEO), getContext()));
    GMTrace.o(16802180497408L, 125186);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayoutWithAll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */