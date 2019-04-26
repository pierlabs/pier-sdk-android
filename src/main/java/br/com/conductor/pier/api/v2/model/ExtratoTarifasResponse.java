package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DetalhesExtratoTarifasResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response do extrato de tarifas
 **/
@ApiModel(description = "Objeto Response do extrato de tarifas")
public class ExtratoTarifasResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("detalhes")
  private List<DetalhesExtratoTarifasResponse> detalhes = null;

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Nome do titular da conta
   **/
  @ApiModelProperty(value = "Nome do titular da conta")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Endere\u00E7o de e-mail do titular da conta
   **/
  @ApiModelProperty(value = "Endere\u00E7o de e-mail do titular da conta")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Lista de detalhes das tarifas
   **/
  @ApiModelProperty(value = "Lista de detalhes das tarifas")
  public List<DetalhesExtratoTarifasResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalhesExtratoTarifasResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoTarifasResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
