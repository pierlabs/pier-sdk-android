package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que encapsula as propriedades do detalhamento do documento.
 **/
@ApiModel(description = "Objeto que encapsula as propriedades do detalhamento do documento.")
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
   * Valor da propriedade do Documento.
   **/
  @ApiModelProperty(value = "Valor da propriedade do Documento.")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }

  
  /**
   * Valor da propriedade do Documento.
   **/
  @ApiModelProperty(value = "Valor da propriedade do Documento.")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }

  
  /**
   * Tipo da propriedade do Documento.
   **/
  @ApiModelProperty(value = "Tipo da propriedade do Documento.")
  public DetalhesTipoEnum getDetalhesTipo() {
    return detalhesTipo;
  }
  public void setDetalhesTipo(DetalhesTipoEnum detalhesTipo) {
    this.detalhesTipo = detalhesTipo;
  }

  
  /**
   * Atributo que indica se o par\u00C3\u00A2metro \u00C3\u00A9 um \u00C3\u00ADndice (default = false)
   **/
  @ApiModelProperty(value = "Atributo que indica se o par\u00C3\u00A2metro \u00C3\u00A9 um \u00C3\u00ADndice (default = false)")
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
