package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TaxaJurosContaListaResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the interest rate response
 **/
@ApiModel(description = "Representation of the interest rate response")
public class TaxaJurosContaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTabelaJuros")
  private Long idTabelaJuros = null;
  @SerializedName("taxasJuros")
  private List<TaxaJurosContaListaResponse> taxasJuros = null;

  
  /**
   * id_conta
   **/
  @ApiModelProperty(value = "id_conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Interest rate identification code
   **/
  @ApiModelProperty(value = "Interest rate identification code")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   * Listing of interest rates
   **/
  @ApiModelProperty(value = "Listing of interest rates")
  public List<TaxaJurosContaListaResponse> getTaxasJuros() {
    return taxasJuros;
  }
  public void setTaxasJuros(List<TaxaJurosContaListaResponse> taxasJuros) {
    this.taxasJuros = taxasJuros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTabelaJuros: ").append(idTabelaJuros).append("\n");
    sb.append("  taxasJuros: ").append(taxasJuros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
