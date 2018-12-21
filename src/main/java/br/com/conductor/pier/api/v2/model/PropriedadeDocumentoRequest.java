package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{propriedade_documento_request_description}}}
 **/
@ApiModel(description = "{{{propriedade_documento_request_description}}}")
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
   * {{{propriedade_documento_request_chave_value}}}
   **/
  @ApiModelProperty(value = "{{{propriedade_documento_request_chave_value}}}")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }

  
  /**
   * {{{propriedade_documento_request_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{propriedade_documento_request_valor_value}}}")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }

  
  /**
   * {{{propriedade_documento_request_detalhes_tipo_value}}}
   **/
  @ApiModelProperty(value = "{{{propriedade_documento_request_detalhes_tipo_value}}}")
  public DetalhesTipoEnum getDetalhesTipo() {
    return detalhesTipo;
  }
  public void setDetalhesTipo(DetalhesTipoEnum detalhesTipo) {
    this.detalhesTipo = detalhesTipo;
  }

  
  /**
   * {{{propriedade_documento_request_flag_indice_value}}}
   **/
  @ApiModelProperty(value = "{{{propriedade_documento_request_flag_indice_value}}}")
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
