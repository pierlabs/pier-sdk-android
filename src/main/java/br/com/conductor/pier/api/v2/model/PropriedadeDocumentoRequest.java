package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object that encapsulate the properties of document detailing
 **/
@ApiModel(description = "Object that encapsulate the properties of document detailing")
public class PropriedadeDocumentoRequest  {
  
  @SerializedName("chave")
  private String chave = null;
  @SerializedName("valor")
  private String valor = null;
  public enum DetalhesTipoEnum {
     IMAGEM,  TEXTO,  NUMERO, 
  };
  @SerializedName("detalhesTipo")
  private DetalhesTipoEnum detalhesTipo = null;
  @SerializedName("flagIndice")
  private Boolean flagIndice = null;

  
  /**
   * Value of the property of document
   **/
  @ApiModelProperty(value = "Value of the property of document")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }

  
  /**
   * Value of the property of document
   **/
  @ApiModelProperty(value = "Value of the property of document")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }

  
  /**
   * Type of the property of document
   **/
  @ApiModelProperty(value = "Type of the property of document")
  public DetalhesTipoEnum getDetalhesTipo() {
    return detalhesTipo;
  }
  public void setDetalhesTipo(DetalhesTipoEnum detalhesTipo) {
    this.detalhesTipo = detalhesTipo;
  }

  
  /**
   * Atrributed to what indicates if the parameter is an index (default =false)
   **/
  @ApiModelProperty(value = "Atrributed to what indicates if the parameter is an index (default =false)")
  public Boolean getFlagIndice() {
    return flagIndice;
  }
  public void setFlagIndice(Boolean flagIndice) {
    this.flagIndice = flagIndice;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropriedadeDocumentoRequest {\n");
    
    sb.append("  chave: ").append(chave).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  detalhesTipo: ").append(detalhesTipo).append("\n");
    sb.append("  flagIndice: ").append(flagIndice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
