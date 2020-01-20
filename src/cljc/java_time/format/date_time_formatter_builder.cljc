(ns cljc.java-time.format.date-time-formatter-builder (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [DateTimeFormatterBuilder]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.format DateTimeFormatterBuilder])))
(clojure.core/defn java.time.format.-date-time-formatter-builder {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11567] (.java.time.format.DateTimeFormatterBuilder this11567)))
(clojure.core/defn to-formatter {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"] ["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this11568 ^java.util.Locale java-util-Locale11569] (.toFormatter this11568 java-util-Locale11569)) (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this11570] (.toFormatter this11570)))
(clojure.core/defn append-pattern {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11571 ^java.lang.String java-lang-String11572] (.appendPattern this11571 java-lang-String11572)))
(clojure.core/defn append-value {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.format.SignStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11573 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11574 ^java.lang.Integer int11575 ^java.lang.Integer int11576 ^java.time.format.SignStyle java-time-format-SignStyle11577] (.appendValue this11573 java-time-temporal-TemporalField11574 int11575 int11576 java-time-format-SignStyle11577)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11578 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11579 ^java.lang.Integer int11580] (.appendValue this11578 java-time-temporal-TemporalField11579 int11580)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11581 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11582] (.appendValue this11581 java-time-temporal-TemporalField11582)))
(clojure.core/defn append-instant {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int"] ["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11583 ^java.lang.Integer int11584] (.appendInstant this11583 int11584)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11585] (.appendInstant this11585)))
(clojure.core/defn append-literal {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "char"] ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [this11586 G__11587] #? (:cljs (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this11586 G__11587) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Character") G__11587)) (clojure.core/let [G__11587 ^"java.lang.Character" G__11587] (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this11586 G__11587)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.String") G__11587)) (clojure.core/let [G__11587 ^"java.lang.String" G__11587] (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this11586 G__11587)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn optional-start {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11588] (.optionalStart this11588)))
(clojure.core/defn append-fraction {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "boolean"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11589 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11590 ^java.lang.Integer int11591 ^java.lang.Integer int11592 ^java.lang.Boolean boolean11593] (.appendFraction this11589 java-time-temporal-TemporalField11590 int11591 int11592 boolean11593)))
(clojure.core/defn append-optional {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11594 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter11595] (.appendOptional this11594 java-time-format-DateTimeFormatter11595)))
(clojure.core/defn optional-end {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11596] (.optionalEnd this11596)))
(clojure.core/defn parse-lenient {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11597] (.parseLenient this11597)))
(clojure.core/defn pad-next {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int"] ["java.time.format.DateTimeFormatterBuilder" "int" "char"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11598 ^java.lang.Integer int11599] (.padNext this11598 int11599)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11600 ^java.lang.Integer int11601 ^java.lang.Character char11602] (.padNext this11600 int11601 char11602)))
(clojure.core/defn append-chronology-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11603] (.appendChronologyId this11603)))
(clojure.core/defn append-zone-or-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11604] (.appendZoneOrOffsetId this11604)))
(clojure.core/defn parse-case-sensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11605] (.parseCaseSensitive this11605)))
(clojure.core/defn parse-strict {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11606] (.parseStrict this11606)))
(clojure.core/defn append-chronology-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11607 ^java.time.format.TextStyle java-time-format-TextStyle11608] (.appendChronologyText this11607 java-time-format-TextStyle11608)))
(clojure.core/defn append-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11609] (.appendOffsetId this11609)))
(clojure.core/defn append-zone-region-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11610] (.appendZoneRegionId this11610)))
(clojure.core/defn parse-defaulting {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11611 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11612 ^long long11613] (.parseDefaulting this11611 java-time-temporal-TemporalField11612 long11613)))
(clojure.core/defn append-zone-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11614] (.appendZoneId this11614)))
(clojure.core/defn get-localized-date-time-pattern {:arglists (quote (["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology" "java.util.Locale"]))} (^java.lang.String [^java.time.format.FormatStyle java-time-format-FormatStyle11615 ^java.time.format.FormatStyle java-time-format-FormatStyle11616 ^java.time.chrono.Chronology java-time-chrono-Chronology11617 ^java.util.Locale java-util-Locale11618] (. java.time.format.DateTimeFormatterBuilder getLocalizedDateTimePattern java-time-format-FormatStyle11615 java-time-format-FormatStyle11616 java-time-chrono-Chronology11617 java-util-Locale11618)))
(clojure.core/defn parse-case-insensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11619] (.parseCaseInsensitive this11619)))
(clojure.core/defn append-localized-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11620 ^java.time.format.TextStyle java-time-format-TextStyle11621] (.appendLocalizedOffset this11620 java-time-format-TextStyle11621)))
(clojure.core/defn append {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11622 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter11623] (.append this11622 java-time-format-DateTimeFormatter11623)))
(clojure.core/defn append-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.time.format.TextStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]))} (^java.time.format.DateTimeFormatterBuilder [this11624 G__11625 G__11626] #? (:cljs (.appendText ^java.time.format.DateTimeFormatterBuilder this11624 G__11625 G__11626) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__11625) (clojure.core/instance? (java.lang.Class/forName "java.time.format.TextStyle") G__11626)) (clojure.core/let [G__11625 ^"java.time.temporal.TemporalField" G__11625 G__11626 ^"java.time.format.TextStyle" G__11626] (.appendText ^java.time.format.DateTimeFormatterBuilder this11624 G__11625 G__11626)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__11625) (clojure.core/instance? (java.lang.Class/forName "java.util.Map") G__11626)) (clojure.core/let [G__11625 ^"java.time.temporal.TemporalField" G__11625 G__11626 ^"java.util.Map" G__11626] (.appendText ^java.time.format.DateTimeFormatterBuilder this11624 G__11625 G__11626)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11627 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11628] (.appendText this11627 java-time-temporal-TemporalField11628)))
(clojure.core/defn append-localized {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle" "java.time.format.FormatStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11629 ^java.time.format.FormatStyle java-time-format-FormatStyle11630 ^java.time.format.FormatStyle java-time-format-FormatStyle11631] (.appendLocalized this11629 java-time-format-FormatStyle11630 java-time-format-FormatStyle11631)))
(clojure.core/defn append-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11632 ^java.lang.String java-lang-String11633 ^java.lang.String java-lang-String11634] (.appendOffset this11632 java-lang-String11633 java-lang-String11634)))
(clojure.core/defn append-value-reduced {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.chrono.ChronoLocalDate"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"]))} (^java.time.format.DateTimeFormatterBuilder [this11635 G__11636 G__11637 G__11638 G__11639] #? (:cljs (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this11635 G__11636 G__11637 G__11638 G__11639) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__11636) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__11637) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__11638) (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__11639)) (clojure.core/let [G__11636 ^"java.time.temporal.TemporalField" G__11636 G__11637 (clojure.core/int G__11637) G__11638 (clojure.core/int G__11638) G__11639 ^"java.time.chrono.ChronoLocalDate" G__11639] (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this11635 G__11636 G__11637 G__11638 G__11639)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__11636) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__11637) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__11638) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__11639)) (clojure.core/let [G__11636 ^"java.time.temporal.TemporalField" G__11636 G__11637 (clojure.core/int G__11637) G__11638 (clojure.core/int G__11638) G__11639 (clojure.core/int G__11639)] (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this11635 G__11636 G__11637 G__11638 G__11639)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn append-zone-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11640 ^java.time.format.TextStyle java-time-format-TextStyle11641] (.appendZoneText this11640 java-time-format-TextStyle11641)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this11642 ^java.time.format.TextStyle java-time-format-TextStyle11643 ^java.util.Set java-util-Set11644] (.appendZoneText this11642 java-time-format-TextStyle11643 java-util-Set11644)))
