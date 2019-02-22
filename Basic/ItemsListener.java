// Generated from Items.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ItemsParser}.
 */
public interface ItemsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ItemsParser#itemmodel}.
	 * @param ctx the parse tree
	 */
	void enterItemmodel(ItemsParser.ItemmodelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#itemmodel}.
	 * @param ctx the parse tree
	 */
	void exitItemmodel(ItemsParser.ItemmodelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItemsParser#modelitem}.
	 * @param ctx the parse tree
	 */
	void enterModelitem(ItemsParser.ModelitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#modelitem}.
	 * @param ctx the parse tree
	 */
	void exitModelitem(ItemsParser.ModelitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItemsParser#modelgroupitem}.
	 * @param ctx the parse tree
	 */
	void enterModelgroupitem(ItemsParser.ModelgroupitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#modelgroupitem}.
	 * @param ctx the parse tree
	 */
	void exitModelgroupitem(ItemsParser.ModelgroupitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItemsParser#basemodelitem}.
	 * @param ctx the parse tree
	 */
	void enterBasemodelitem(ItemsParser.BasemodelitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#basemodelitem}.
	 * @param ctx the parse tree
	 */
	void exitBasemodelitem(ItemsParser.BasemodelitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItemsParser#modelgroupfunction}.
	 * @param ctx the parse tree
	 */
	void enterModelgroupfunction(ItemsParser.ModelgroupfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#modelgroupfunction}.
	 * @param ctx the parse tree
	 */
	void exitModelgroupfunction(ItemsParser.ModelgroupfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItemsParser#modelbinding}.
	 * @param ctx the parse tree
	 */
	void enterModelbinding(ItemsParser.ModelbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#modelbinding}.
	 * @param ctx the parse tree
	 */
	void exitModelbinding(ItemsParser.ModelbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItemsParser#modelproperty}.
	 * @param ctx the parse tree
	 */
	void enterModelproperty(ItemsParser.ModelpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#modelproperty}.
	 * @param ctx the parse tree
	 */
	void exitModelproperty(ItemsParser.ModelpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItemsParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void enterValuetype(ItemsParser.ValuetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItemsParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void exitValuetype(ItemsParser.ValuetypeContext ctx);
}