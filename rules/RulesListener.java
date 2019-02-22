// Generated from Rules.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RulesParser}.
 */
public interface RulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RulesParser#rulemodel}.
	 * @param ctx the parse tree
	 */
	void enterRulemodel(RulesParser.RulemodelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#rulemodel}.
	 * @param ctx the parse tree
	 */
	void exitRulemodel(RulesParser.RulemodelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#modelrule}.
	 * @param ctx the parse tree
	 */
	void enterModelrule(RulesParser.ModelruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#modelrule}.
	 * @param ctx the parse tree
	 */
	void exitModelrule(RulesParser.ModelruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#rulez}.
	 * @param ctx the parse tree
	 */
	void enterRulez(RulesParser.RulezContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#rulez}.
	 * @param ctx the parse tree
	 */
	void exitRulez(RulesParser.RulezContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(RulesParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(RulesParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#then}.
	 * @param ctx the parse tree
	 */
	void enterThen(RulesParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#then}.
	 * @param ctx the parse tree
	 */
	void exitThen(RulesParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(RulesParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(RulesParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void enterValuetype(RulesParser.ValuetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void exitValuetype(RulesParser.ValuetypeContext ctx);
}