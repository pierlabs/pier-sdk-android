package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response representation of the travel notification resource
 **/
@ApiModel(description = "Response representation of the travel notification resource")
public class AvisoViagemResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("codigoPais")
  private String codigoPais = null;
  @SerializedName("dataInicio")
  private String dataInicio = null;
  @SerializedName("dataFim")
  private String dataFim = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;

  
  /**
   * Unique identifier Code of the travel notification in the base (id)
   **/
  @ApiModelProperty(value = "Unique identifier Code of the travel notification in the base (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier Code of the card in the base (id)
   **/
  @ApiModelProperty(value = "Identifier Code of the card in the base (id)")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identifier Code of the country in the base (id)
   **/
  @ApiModelProperty(value = "Identifier Code of the country in the base (id)")
  public String getCodigoPais() {
    return codigoPais;
  }
  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  
  /**
   * Beginning date of the travel notification
   **/
  @ApiModelProperty(value = "Beginning date of the travel notification")
  public String getDataInicio() {
    return dataInicio;
  }
  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }

  
  /**
   * Ending date of the travel notification
   **/
  @ApiModelProperty(value = "Ending date of the travel notification")
  public String getDataFim() {
    return dataFim;
  }
  public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
  }

  
  /**
   * Identify if the travel notification is active or not
   **/
  @ApiModelProperty(value = "Identify if the travel notification is active or not")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvisoViagemResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  codigoPais: ").append(codigoPais).append("\n");
    sb.append("  dataInicio: ").append(dataInicio).append("\n");
    sb.append("  dataFim: ").append(dataFim).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
