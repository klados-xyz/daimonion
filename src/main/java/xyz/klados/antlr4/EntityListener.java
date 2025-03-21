package xyz.klados.antlr4;// Generated from Entity.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EntityParser}.
 */
public interface EntityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EntityParser#entityFile}.
	 * @param ctx the parse tree
	 */
	void enterEntityFile(EntityParser.EntityFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#entityFile}.
	 * @param ctx the parse tree
	 */
	void exitEntityFile(EntityParser.EntityFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#entityDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEntityDeclaration(EntityParser.EntityDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#entityDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEntityDeclaration(EntityParser.EntityDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EntityParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EntityParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(EntityParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(EntityParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(EntityParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(EntityParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(EntityParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(EntityParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EntityParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EntityParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(EntityParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(EntityParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EntityParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EntityParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(EntityParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(EntityParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(EntityParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(EntityParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EntityParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EntityParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#arraySuffix}.
	 * @param ctx the parse tree
	 */
	void enterArraySuffix(EntityParser.ArraySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#arraySuffix}.
	 * @param ctx the parse tree
	 */
	void exitArraySuffix(EntityParser.ArraySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EntityParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EntityParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(EntityParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(EntityParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(EntityParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(EntityParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EntityParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EntityParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(EntityParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(EntityParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(EntityParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(EntityParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(EntityParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(EntityParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(EntityParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(EntityParser.ArrayLiteralContext ctx);
}