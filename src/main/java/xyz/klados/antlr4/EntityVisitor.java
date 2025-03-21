package xyz.klados.antlr4;// Generated from Entity.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EntityParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EntityVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EntityParser#entityFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityFile(EntityParser.EntityFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#entityDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDeclaration(EntityParser.EntityDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(EntityParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(EntityParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(EntityParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(EntityParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EntityParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(EntityParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(EntityParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(EntityParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(EntityParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EntityParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#arraySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySuffix(EntityParser.ArraySuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EntityParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(EntityParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(EntityParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EntityParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(EntityParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(EntityParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(EntityParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(EntityParser.ArrayLiteralContext ctx);
}