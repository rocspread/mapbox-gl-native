// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.

package com.mapbox.mapboxsdk.testapp.style;

import android.graphics.Color;
import android.support.test.runner.AndroidJUnit4;

import timber.log.Timber;

import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.layers.LineLayer;
import com.mapbox.mapboxsdk.testapp.activity.BaseActivityTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.mapbox.mapboxsdk.style.expressions.Expression.*;
import static com.mapbox.mapboxsdk.testapp.action.MapboxMapAction.invoke;
import static org.junit.Assert.*;
import static com.mapbox.mapboxsdk.style.layers.Property.*;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.*;

import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.testapp.activity.espresso.EspressoTestActivity;

/**
 * Basic smoke tests for LineLayer
 */
@RunWith(AndroidJUnit4.class)
public class LineLayerTest extends BaseActivityTest {

  private LineLayer layer;

  @Override
  protected Class getActivityClass() {
    return EspressoTestActivity.class;
  }

  private void setupLayer() {
    Timber.i("Retrieving layer");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
        Timber.i("Adding layer");
        layer = new LineLayer("my-layer", "composite");
        layer.setSourceLayer("composite");
        mapboxMap.addLayer(layer);
        // Layer reference is now stale, get new reference
        layer = mapboxMap.getLayerAs("my-layer");
      }
    });
  }

  @Test
  public void testSourceId() {
    validateTestSetup();
    setupLayer();
    Timber.i("SourceId");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      // Get source id
      assertEquals(layer.getSourceId(), "composite");
    });
  }

  @Test
  public void testSetVisibility() {
    validateTestSetup();
    setupLayer();
    Timber.i("Visibility");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Get initial
      assertEquals(layer.getVisibility().getValue(), VISIBLE);

      // Set
      layer.setProperties(visibility(NONE));
      assertEquals(layer.getVisibility().getValue(), NONE);
    });
  }

  @Test
  public void testSourceLayer() {
    validateTestSetup();
    setupLayer();
    Timber.i("SourceLayer");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Get initial
      assertEquals(layer.getSourceLayer(), "composite");

      // Set
      final String sourceLayer = "test";
      layer.setSourceLayer(sourceLayer);
      assertEquals(layer.getSourceLayer(), sourceLayer);
    });
  }

  @Test
  public void testFilter() {
    validateTestSetup();
    setupLayer();
    Timber.i("Filter");
    invoke(mapboxMap, (uiController, mapboxMap1) -> {
      assertNotNull(layer);

      // Get initial
      assertEquals(layer.getFilter(), null);

      // Set
      Expression filter = eq(get("undefined"), literal(1.0));
      layer.setFilter(filter);
      assertEquals(layer.getFilter().toString(), filter.toString());

      // Set constant
      filter = literal(true);
      layer.setFilter(filter);
      assertEquals(layer.getFilter().toString(), filter.toString());
    });
  }



  @Test
  public void testLineCapAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-cap");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineCap().getValue());

      // Set and Get
      String propertyValue = LINE_CAP_BUTT;
      layer.setProperties(lineCap(propertyValue));
      assertEquals(layer.getLineCap().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineJoinAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-join");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineJoin().getValue());

      // Set and Get
      String propertyValue = LINE_JOIN_BEVEL;
      layer.setProperties(lineJoin(propertyValue));
      assertEquals(layer.getLineJoin().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineJoinAsExpression() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-join-expression");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineJoin().getExpression());

      // Set and Get
      Expression expression = string(Expression.get("undefined"));
      layer.setProperties(lineJoin(expression));
      assertEquals(layer.getLineJoin().getExpression(), expression);
    });
  }

  @Test
  public void testLineMiterLimitAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-miter-limit");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineMiterLimit().getValue());

      // Set and Get
      Float propertyValue = 0.3f;
      layer.setProperties(lineMiterLimit(propertyValue));
      assertEquals(layer.getLineMiterLimit().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineRoundLimitAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-round-limit");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineRoundLimit().getValue());

      // Set and Get
      Float propertyValue = 0.3f;
      layer.setProperties(lineRoundLimit(propertyValue));
      assertEquals(layer.getLineRoundLimit().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineOpacityTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-opacityTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineOpacityTransition(options);
      assertEquals(layer.getLineOpacityTransition(), options);
    });
  }

  @Test
  public void testLineOpacityAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-opacity");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineOpacity().getValue());

      // Set and Get
      Float propertyValue = 0.3f;
      layer.setProperties(lineOpacity(propertyValue));
      assertEquals(layer.getLineOpacity().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineOpacityAsExpression() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-opacity-expression");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineOpacity().getExpression());

      // Set and Get
      Expression expression = number(Expression.get("undefined"));
      layer.setProperties(lineOpacity(expression));
      assertEquals(layer.getLineOpacity().getExpression(), expression);
    });
  }

  @Test
  public void testLineColorTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-colorTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineColorTransition(options);
      assertEquals(layer.getLineColorTransition(), options);
    });
  }

  @Test
  public void testLineColorAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-color");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineColor().getValue());

      // Set and Get
      String propertyValue = "rgba(0, 0, 0, 1)";
      layer.setProperties(lineColor(propertyValue));
      assertEquals(layer.getLineColor().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineColorAsExpression() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-color-expression");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineColor().getExpression());

      // Set and Get
      Expression expression = toColor(Expression.get("undefined"));
      layer.setProperties(lineColor(expression));
      assertEquals(layer.getLineColor().getExpression(), expression);
    });
  }

  @Test
  public void testLineColorAsIntConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-color");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      layer.setProperties(lineColor(Color.RED));
      assertEquals(layer.getLineColorAsInt(), Color.RED);
    });
  }

  @Test
  public void testLineTranslateTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-translateTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineTranslateTransition(options);
      assertEquals(layer.getLineTranslateTransition(), options);
    });
  }

  @Test
  public void testLineTranslateAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-translate");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineTranslate().getValue());

      // Set and Get
      Float[] propertyValue = new Float[] {0f, 0f};
      layer.setProperties(lineTranslate(propertyValue));
      assertEquals(layer.getLineTranslate().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineTranslateAnchorAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-translate-anchor");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineTranslateAnchor().getValue());

      // Set and Get
      String propertyValue = LINE_TRANSLATE_ANCHOR_MAP;
      layer.setProperties(lineTranslateAnchor(propertyValue));
      assertEquals(layer.getLineTranslateAnchor().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineWidthTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-widthTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineWidthTransition(options);
      assertEquals(layer.getLineWidthTransition(), options);
    });
  }

  @Test
  public void testLineWidthAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-width");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineWidth().getValue());

      // Set and Get
      Float propertyValue = 0.3f;
      layer.setProperties(lineWidth(propertyValue));
      assertEquals(layer.getLineWidth().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineWidthAsExpression() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-width-expression");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineWidth().getExpression());

      // Set and Get
      Expression expression = number(Expression.get("undefined"));
      layer.setProperties(lineWidth(expression));
      assertEquals(layer.getLineWidth().getExpression(), expression);
    });
  }

  @Test
  public void testLineGapWidthTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-gap-widthTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineGapWidthTransition(options);
      assertEquals(layer.getLineGapWidthTransition(), options);
    });
  }

  @Test
  public void testLineGapWidthAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-gap-width");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineGapWidth().getValue());

      // Set and Get
      Float propertyValue = 0.3f;
      layer.setProperties(lineGapWidth(propertyValue));
      assertEquals(layer.getLineGapWidth().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineGapWidthAsExpression() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-gap-width-expression");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineGapWidth().getExpression());

      // Set and Get
      Expression expression = number(Expression.get("undefined"));
      layer.setProperties(lineGapWidth(expression));
      assertEquals(layer.getLineGapWidth().getExpression(), expression);
    });
  }

  @Test
  public void testLineOffsetTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-offsetTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineOffsetTransition(options);
      assertEquals(layer.getLineOffsetTransition(), options);
    });
  }

  @Test
  public void testLineOffsetAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-offset");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineOffset().getValue());

      // Set and Get
      Float propertyValue = 0.3f;
      layer.setProperties(lineOffset(propertyValue));
      assertEquals(layer.getLineOffset().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineBlurTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-blurTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineBlurTransition(options);
      assertEquals(layer.getLineBlurTransition(), options);
    });
  }

  @Test
  public void testLineBlurAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-blur");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineBlur().getValue());

      // Set and Get
      Float propertyValue = 0.3f;
      layer.setProperties(lineBlur(propertyValue));
      assertEquals(layer.getLineBlur().getValue(), propertyValue);
    });
  }

  @Test
  public void testLineBlurAsExpression() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-blur-expression");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineBlur().getExpression());

      // Set and Get
      Expression expression = number(Expression.get("undefined"));
      layer.setProperties(lineBlur(expression));
      assertEquals(layer.getLineBlur().getExpression(), expression);
    });
  }

  @Test
  public void testLineDasharrayTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-dasharrayTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLineDasharrayTransition(options);
      assertEquals(layer.getLineDasharrayTransition(), options);
    });
  }

  @Test
  public void testLineDasharrayAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-dasharray");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLineDasharray().getValue());

      // Set and Get
      Float[] propertyValue = new Float[] {};
      layer.setProperties(lineDasharray(propertyValue));
      assertEquals(layer.getLineDasharray().getValue(), propertyValue);
    });
  }

  @Test
  public void testLinePatternTransition() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-patternTransitionOptions");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);

      // Set and Get
      TransitionOptions options = new TransitionOptions(300, 100);
      layer.setLinePatternTransition(options);
      assertEquals(layer.getLinePatternTransition(), options);
    });
  }

  @Test
  public void testLinePatternAsConstant() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-pattern");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLinePattern().getValue());

      // Set and Get
      String propertyValue = "pedestrian-polygon";
      layer.setProperties(linePattern(propertyValue));
      assertEquals(layer.getLinePattern().getValue(), propertyValue);
    });
  }

  @Test
  public void testLinePatternAsExpression() {
    validateTestSetup();
    setupLayer();
    Timber.i("line-pattern-expression");
    invoke(mapboxMap, (uiController, mapboxMap) -> {
      assertNotNull(layer);
      assertNull(layer.getLinePattern().getExpression());

      // Set and Get
      Expression expression = string(Expression.get("undefined"));
      layer.setProperties(linePattern(expression));
      assertEquals(layer.getLinePattern().getExpression(), expression);
    });
  }
}
