// Generated from Basic.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasicParser}.
 */
public interface BasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasicParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(BasicParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(BasicParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(BasicParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(BasicParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(BasicParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(BasicParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(BasicParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(BasicParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(BasicParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(BasicParser.RulesContext ctx);
}